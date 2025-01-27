#include <iostream>
#include <iomanip>
using namespace std;
int main(){
  int A,B,C;
  cout<<"Enter the three values";
  cin>>A>>B>>C;
  if(A>B){
      if(A>C){
          cout<<A<<" is greater"<<endl;
      } 
      else{
          cout<<C<<" is greater"<<endl;
      }
  }
  else{
      if (B>C){
      cout <<B<<" is greater"<<endl;
      }
      else{
          cout<<C<<" is greater"<<endl;
      }
  }

}