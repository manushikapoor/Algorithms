class Solution{
    public static void main(String[] args) {
        int[] array={1,2,3,5,10,10,10,10,12};
        solve(array, 10);
       
    }
    public static void solve(int[] array,int key){
    
        int low=0;
        int high=array.length;
        int count=0;


        // o(logn*3)=o(logn)
        while(low<=high){

            int mid =low+high/2;
            System.out.println(mid);



            if(array[mid]==key){
                int temp=mid;
               while(array[mid]==key){
                    count++;
                    mid--;
               }
             
                mid=temp;
                
                while(array[mid]==key){
                    count++;
                    mid++;
                }

                System.out.println(count-1);
                return;
            }



            else if(mid<key){
                low=mid+1;
            }
            else if(mid>key){
                high=mid-1;
            }


               
            }
             
           


        }

        
    
    
    }
