package org.example.narendra.array.exception;

import java.io.IOException;

class ExceptionExample {
 private static void test() {
  try {
      throw  new IOException("hello");
  } catch (IOException e) {}
 }
}