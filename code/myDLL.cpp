#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include "myDLL.h"

int main() {
  printf("this is a library, please call 'cosh'");
  return 0;
}

double myCosh(double value) {
  return cosh(value);
}
