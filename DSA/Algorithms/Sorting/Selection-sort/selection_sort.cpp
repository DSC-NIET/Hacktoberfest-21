//binary search
#include<iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter array size : ";
    cin>>n;
    cout<<"Enter array ";
    int array[n];
    for (int i = 0; i < n; i++)
    {
        cin>>array[i];
        /* code */
    }
    cout<<"Array you entered ";
    for (int i = 0; i < n; i++)
    {
        cout<<array[i]<<"\t ";
        /* code */
    }
    cout<<endl;
    for (int i = 0; i < n-1; i++){
        for (int j = i+1; j < n; j++){
            if(array[i]>array[j]){
                int temp = array[i];
                array[i]=array[j];
                array[j] = temp;
            }
        }
    } 
    cout<<"Sorted Array  \n";
    for (int i = 0; i < n; i++)
    {
        cout<<array[i]<<" ";
        /* code */
    }
    cout<<endl;
}