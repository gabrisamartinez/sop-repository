#include <stdio.h>
#include <stdlib.h>

int main(void) {
  FILE *file;
  char word[20];
  int inte;
  float f;
  char c;

   file = fopen("teste.txt", "w");

   if(file == NULL)
   {
     printf("Erro na abertura do arquivo");
    return 1;
   }

   printf("Escreva uma palavra, um inteiro,um decimal e uma letra: ");
   scanf("%s %d %f %c", &word, &inte, &f, &c);

   fprintf(file, "%s %d %f %c", word, inte, f, c);

   printf("Gravando no Arquivo...\n");
   printf("Gravacao realizada!\n\n");

   fclose(file);

   return 0;
}
