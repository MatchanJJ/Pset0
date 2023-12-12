#include <stdio.h>
#include <cs50.h>

int main (void)
{

int startllama, endllama, years;

do
{
    startllama = get_int("Enter starting number of llama");
}
while (startllama < 9 );

do
{
    endllama = get_int("Enter end number of llama");
}
while (endllama < startllama);

years = 0;

do
{
   startllama = startllama + (startllama/3)- (startllama/4);
   years++;

} while (startllama < endllama);


printf("Years needed %i\n",years);
}
