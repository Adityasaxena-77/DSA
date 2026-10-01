// public class Ologn{ every time array is half so that time complexity is O(logn) also called logarithmic time complexity
//      public static void main(String[] args){
//          int arr[]={10,20,30,40,50,60,70,80,90,100};
//          int left=0;
//          int right=arr.length-1;
//          int target=70;
//          while(left<=right){
//             int mid=(left + right)/2;
//             if(arr[mid]==target){
//                 System.out.println(arr[mid]);
//                 break;
//             }else if(arr[mid]<target){
//                 left=mid+1;
//             }else{
//                 right=mid-1;
//             }
//          }
//      }
// }