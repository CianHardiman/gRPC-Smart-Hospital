// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: staffing.proto

package com.project;

public interface APIResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:project.APIResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string responseText = 1;</code>
   */
  java.lang.String getResponseText();
  /**
   * <code>string responseText = 1;</code>
   */
  com.google.protobuf.ByteString
      getResponseTextBytes();

  /**
   * <code>int32 responseCode = 2;</code>
   */
  int getResponseCode();

  /**
   * <code>string doctors = 3;</code>
   */
  java.lang.String getDoctors();
  /**
   * <code>string doctors = 3;</code>
   */
  com.google.protobuf.ByteString
      getDoctorsBytes();

  /**
   * <code>string nurses = 4;</code>
   */
  java.lang.String getNurses();
  /**
   * <code>string nurses = 4;</code>
   */
  com.google.protobuf.ByteString
      getNursesBytes();
}
