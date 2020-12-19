
package datastructure_graphalgorithm;

import java.util.Scanner;
import java.util.*;
public class DataStructure {
    Stack<Integer> stack = new Stack<Integer>();
    int i,j,data[],result,number,fintitem,LeftArr[],RightArr[];
    Scanner input = new Scanner(System.in);
    /*============================================================================
                        Liner Search Algorithm
    =============================================================================*/
    public void linearSearch(){
        this.commonInfo();
        this.getArrayInput(number, data);
        System.out.printf("Which number you want to find? Please enter that number:");
        fintitem = input.nextInt();
        for(i=0;i<number;i++){
            if(data[i]==fintitem){
                System.out.println("Item found");
                break;
            }
        }
        if(i==number){
            System.out.println("Item not found");
        }
    }
    /*============================================================================
                        Binary Search Algorithm
    =============================================================================*/
    public void binarySearch(){
        int beg=1,end,mid;
        this.commonInfo();
        end = number;
        mid = (beg+end)/2;
        this.getArrayInput(number, data);
        System.out.printf("Please enter the number that you want to find:");
        fintitem = input.nextInt();
        while(beg<=end){
            if(fintitem<data[mid]){
                end = mid-1;
            }else if(fintitem>data[mid]){
                beg= mid+1;
            }else if(fintitem==data[mid]){
                System.out.println("Item found");
                break;
            }
             mid = (beg+end)/2;
        }
        if(beg>end){
            System.out.println("Item not found");
        }
    }
    /*============================================================================
                        Bubble Short Algorithm
    =============================================================================*/
    public void bubbleShort(){
        int temp;
        this.commonInfo();
        this.getArrayInput(number, data);
        for(i=0;i<number-1;i++){
            for(j=0;j<(number-i)-1;j++){
               if(data[j]>data[j+1]){
                   temp=data[j];
                   data[j]=data[j+1];
                   data[j+1]=temp;
               }
            }
        }
        this.shortingResult(number, data);
    }
    /*============================================================================
                        Insertion Short Algorithm
    =============================================================================*/
    public void insertionShort(){
        int temp;
        this.commonInfo();
        this.getArrayInput(number, data);
        for(j=1;j<number;j++){
            temp=data[j];
            int k=j-1;
            while(k>=0 && data[k]>temp){
                data[k+1]=data[k];
                k--;
            }
            data[k+1]=temp;
        }
        this.shortingResult(number, data);
    }
    /*============================================================================
                        Selection Short Algorithm
    =============================================================================*/
    public void selectionSort(){
        int temp;
        this.commonInfo();
        this.getArrayInput(number, data);
        for(i=0;i<number;i++){
            int min=i;
            for(j=0+i;j<number;j++){
                if(data[j]<data[min]){
                    min = j;
                }
            }
            temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
        this.shortingResult(number, data);
    }
    /*============================================================================
                        Quick Short Algorithm
    =============================================================================*/
    public void quickSort(){
        int temp;
        this.commonInfo();
        this.getArrayInput(number, data);
        this.quickSortInner(data,0,number-1);
        this.shortingResult(number, data);
    }
    /*============================================================================
                        Quick Short Inner Algorithm
    =============================================================================*/
    private void quickSortInner(int qarr[],int first,int last){
        int pivot, temp;
        if(first<last){
            pivot=first;
            i=first;
            j=last;
            while(i<j){
                while(qarr[i]<=qarr[pivot]&&i<last)
                i++;
                while(qarr[j]>qarr[pivot])
                j--;
                if(i<j){
                    temp=qarr[i];
                    qarr[i]=qarr[j];
                    qarr[j]=temp;
                }
            }
            temp=qarr[pivot];
            qarr[pivot]=qarr[j];
            qarr[j]=temp;
            quickSortInner(qarr,first,j-1);
            quickSortInner(qarr,j+1,last);
        }
    }
    /*============================================================================
                        Merge Short Inner Algorithm
    =============================================================================*/
    public void mergeShort(){
        int temp;
        this.commonInfo();
        this.getArrayInput(number, data);
        this.mergeShortInnaer(data,0,number-1);
        this.shortingResult(number, data);
    }
    /*============================================================================
                        Merge Short Inner Algorithm
    =============================================================================*/
    private void mergeShortInnaer(int data[],int left, int right){
        if (left < right) {
            int center = left + (right - left) / 2;
            mergeShortInnaer(data, left, center);
            mergeShortInnaer(data, center + 1, right);
            mergeShortAlg(data, left, center, right);
        }
    }
    private void mergeShortAlg(int data[],int left, int middle, int right){
        int k,left_size,right_size;
        left_size = middle - left + 1;
        right_size = right - middle;

    /* create temp arrays */
    LeftArr = new int[left_size];
    RightArr= new int[right_size];

    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < left_size; i++)
        LeftArr[i] = data[left + i];
    for (j = 0; j < right_size; j++)
        RightArr[j] = data[middle + 1 + j];
    i = 0;
    j = 0;
    k = left;
    while (i < left_size && j < right_size) {
        if (LeftArr[i] <= RightArr[j]) {
            data[k] = LeftArr[i];
            i++;
        }
        else {
            data[k] = RightArr[j];
            j++;
        }
        k++;
    }


    while (i < left_size) {
        data[k] = LeftArr[i];
        i++;
        k++;
    }
    while (j < right_size) {
        data[k] = RightArr[j];
        j++;
        k++;
    }
    }
    /*============================================================================
                        Stack Algorithm
    =============================================================================*/
    public void stkPushPopDispaly(){
       
        while(true){
            System.out.printf("1.Push 2.POP 3.Display\n");
            System.out.printf("Please choice a option:");
            fintitem = input.nextInt();
            if(fintitem==1){
                System.out.printf("Please Enter a value:");
                number = input.nextInt();
                stack.push(number);
            }else if(fintitem==2){
                stack.pop();
            }else if(fintitem==3){
                System.out.println("Stack Result:"+stack);
            }
        }
    }
    /*============================================================================
                        Common Information Of All Algorithm
    =============================================================================*/
    private void commonInfo(){
        System.out.printf("How many numbers do you want to enter?:");
        number = input.nextInt();
        data = new int[number];
        System.out.printf("Please Enter %d Integer numbers:",number);
    }
    /*============================================================================
                        Get Input Of All Algorithm
    =============================================================================*/
    private void getArrayInput(int number, int data[]){
        for(i=0;i<number;i++){
            data[i]=input.nextInt();
        }
    }
    /*============================================================================
                        Result Of All Algorithm
    =============================================================================*/
    private void shortingResult(int number, int data[]){
        System.out.println("***************Result after shorting*****************");
        for(i=0;i<number;i++){
            System.out.printf("%d ",data[i]);
        }
        System.out.println("");
        System.out.println("***************End result*****************");
    }
}
