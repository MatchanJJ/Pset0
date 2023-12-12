#include <stdio.h>
#include <cs50.h>
#include <math.h>

int every_other_digit(long card);
int multiplyAndSum(int last_digit);
int number_of_digits(long card);
bool isAmex(long card, int numDigits);
bool isMasterCard(long card, int numDigits);
bool isVisa(long card, int numDigits);

int main (void){

    long card;
    card = get_long("Enter Card Number: ");
    int sum_every_other_digit = every_other_digit(card);
    int numDigits = number_of_digits(card);
    bool amex = isAmex(card, numDigits);
    bool mcard = isMasterCard(card, numDigits);
    bool visa = isVisa(card,numDigits);
    if (sum_every_other_digit % 10 != 0){
        printf("INVALID\n");
        return 0;
    }
    else if (amex==true){
        printf("AMEX\n");
    }else if (mcard == true){
        printf("MASTERCARD\n");
    }else if (visa == true){
        printf("VISA\n");
    }else{
        printf("INVALID\n");
        return 0;
    }

}
bool isAmex(long card, int numDigits){
    int first_two_digits = card / pow(10,13);
    if((numDigits == 15)&&(first_two_digits == 34 || first_two_digits == 37)){
        return true;
    }else {
        return false;
    }
}
bool isMasterCard(long card, int numDigits){
    int first_two_digits = card / pow(10,14);
    if((numDigits == 16)&&(first_two_digits >50 && first_two_digits <56)){
        return true;
    }else {
        return false;
    }
}
bool isVisa(long card, int numDigits) {
    if (numDigits == 13) {
        int first_digit = card / pow(10, 12);
        if (first_digit == 4) {
            return true;
        }
    } else if (numDigits == 16) {
        int first_digit = card / pow(10, 15);
        if (first_digit == 4) {
            return true;
        }
    }
        return false;

}

int number_of_digits(long card)
{
    int count = 0;
    while (card> 0){
        count++;
        card /=10;
    }
    return count;
}
int every_other_digit(long card){
    int sum = 0;
    bool alternate = false;
    while(card>0){
        if (alternate == true){
            int last_digit = card % 10;
            int product = multiplyAndSum(last_digit);
            sum += product;
        }else{
            int last_digit = card % 10;
            sum += last_digit;
        }
        alternate = !alternate;
        card /= 10;

    }
    return sum;
}
int multiplyAndSum(int last_digit)
{
    int multiply = last_digit * 2;
    int sum = 0;
    while(multiply > 0){
        int last_digit_multiply = multiply % 10;
        sum += last_digit_multiply;
        multiply /= 10;
    }
    return sum;
}

