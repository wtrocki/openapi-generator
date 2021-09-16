/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"fmt"
)

// OuterEnumInteger the model 'OuterEnumInteger'
type OuterEnumInteger int32

// List of OuterEnumInteger
const (
	OUTERENUMINTEGER__0 OuterEnumInteger = 0
	OUTERENUMINTEGER__1 OuterEnumInteger = 1
	OUTERENUMINTEGER__2 OuterEnumInteger = 2
)

// All allowed values of OuterEnumInteger enum
var AllowedOuterEnumIntegerEnumValues = []OuterEnumInteger{
	0,
	1,
	2,
}

func (v *OuterEnumInteger) UnmarshalJSON(src []byte) error {
	var value int32
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := OuterEnumInteger(value)
	for _, existing := range allowedOuterEnumIntegerEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid OuterEnumInteger", value)
}

// NewOuterEnumIntegerFromValue returns a pointer to a valid OuterEnumInteger
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOuterEnumIntegerFromValue(v int32) (*OuterEnumInteger, error) {
	ev := OuterEnumInteger(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for OuterEnumInteger: valid values are %v", v, allowedOuterEnumIntegerEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OuterEnumInteger) IsValid() bool {
	for _, existing := range allowedOuterEnumIntegerEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to OuterEnumInteger value
func (v OuterEnumInteger) Ptr() *OuterEnumInteger {
	return &v
}

type NullableOuterEnumInteger struct {
	value *OuterEnumInteger
	isSet bool
}

func (v NullableOuterEnumInteger) Get() *OuterEnumInteger {
	return v.value
}

func (v *NullableOuterEnumInteger) Set(val *OuterEnumInteger) {
	v.value = val
	v.isSet = true
}

func (v NullableOuterEnumInteger) IsSet() bool {
	return v.isSet
}

func (v *NullableOuterEnumInteger) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOuterEnumInteger(val *OuterEnumInteger) *NullableOuterEnumInteger {
	return &NullableOuterEnumInteger{value: val, isSet: true}
}

func (v NullableOuterEnumInteger) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOuterEnumInteger) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

