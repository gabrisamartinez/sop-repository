#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  FILE *file;
  char word[20];
  int inte;
  float f;
  char c;
  time_t rawtime;
  struct tm * timeinfo;

   file = fopen("teste.txt", "a");

   if(file == NULL)
   {
     printf("Erro na abertura do arquivo");
    return 1;
   }

    printf("Escreva uma palavra, um inteiro,um decimal e uma letra: ");
    scanf("%s %d %f %c", &word, &inte, &f, &c);
    time ( &rawtime );
    timeinfo = localtime ( &rawtime );

    fprintf(file, "\n%s %d %f %c %s", word, inte, f, c, asctime (timeinfo));

    printf("Gravando no Arquivo...\n");
    printf("Gravacao realizada!\n\n");

    fclose(file);

   return 0;
}
