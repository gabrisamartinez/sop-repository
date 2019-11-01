#include <stdio.h>
#include <stdlib.h>
int main(void) {
   int c, x;
   float y;
   char text[100];
   FILE *file;
   file = fopen("teste.txt", "r");
   if(file) {
     fscanf(file, "%s %d %f",  &text, &x, &y);
    printf("%s %d %.2f", text, x, y);
     fclose(file);
   }
}
