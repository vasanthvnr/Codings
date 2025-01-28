#include <iostream>
#include <iomanip>
using namespace std;
int main(){
  int num1,num2;
  int add,sub;
  cin>>num1>>num2;
  add=abs(num1+num2);
  sub=abs(num1-num2);
  cout<<"the addition of "<<num1<<" & "<<num2<<" is : "<<add<<endl;
  cout<<"the subtraction of "<<num1<<" & "<<num2<<" is : "<<sub<<endl;
 
}