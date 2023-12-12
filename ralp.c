#include <stdio.h>
#include <cs50.h>

int main (void)
{

int startllama, endllama, years;

do
{
    startllama = get_int("Enter starting year");
} 
while (startllama < 9 );

do
{
    endllama = get_int("Enter End Year");
} 
while (endllama < startllama);

years = 0;
while (startllama < endllama)
{
   startllama += startllama / 12;
   years++;
}
printf("Years needed: %i\n", years);
}