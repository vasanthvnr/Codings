#include <iostream>
#include <iomanip>
using namespace std;
int main(){
  int num;
  cin>>num;
  if(num<=2000){
    cout<<"Time estimated: 25 minutes";
  }
  else if(num>2001 && num<4000){
    cout<<"Time estimated: 35 minutes";
  }
  else if(num>4000 && num<7000){
    cout<<"Time estimated: 45 minutes";
  }
  else if(num==0){
    cout<<"Time estimated: 00 minutes";
  }
  else if(num<0){
    cout<<"INVALID INPUT";
  }
  else{
    cout<<"OVER LOADED";
  }
}