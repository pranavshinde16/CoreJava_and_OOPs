

public class Faltu {

    static int BalanceFruits(int a,int m,int rs ){
        if(a>m){
            int Mangoes = a-m;
            int MangoPrice = Mangoes*1;
            return rs-MangoPrice;
        }

        else if(a<m){
            int Mangoes = m-a;
            int MangoPrice = Mangoes*1;
            return rs+MangoPrice;
        }
        else{
            return rs;
        }
    }

    // r = rat
    static int countHouse(int r,int unit, int[] arr,int n){
        int foodRequired = r*unit;
        int house = 0;
        int sum =0;

        for(int i=0;i<=n;i++){
            sum = sum+arr[i];
            house++;
            if (sum>=foodRequired) {
                return house;
            }
        }
        return 0;
    }

    static int ProductSmallestPair(int[] arr,int sum){  // 5 2 4 3 9 7 1
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }
            else if((arr[i]<secondMin) && (arr[i]!=min)){
                    secondMin = arr[i];
            }

        }
        int k = (min+secondMin);
        if(k<sum){
            return min*secondMin;
        }
        return 0;
    }

    public static void main(String[] args) {

//        int c = BalanceFruits(8,8,6);
//        System.out.println(c);
//
        int[] array = {9,8,3,-7,3,9};
//        int m = countHouse(4,2,array,8);
//        System.out.println("The no of houses are:"+m);
        System.out.println(ProductSmallestPair(array,4));

    }
}





//    Problem Description :  RatHouse
//
//        The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as
//        its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat
//        consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number,
//        where 0 <= i
//
//        Note:
//
//        Return -1 if the array is null
//        Return 0 if the total amount of food from all houses is not sufficient for all the rats.
//        Computed values lie within the integer range.
//        Example:
//
//        Input:
//
//        r: 7
//        unit: 2
//        n: 8
//        arr: 2 8 3 5 7 4 1 2
//        Output:
//
//        4
//
//        Explanation:
//
//        Total amount of food required for all rats = r * unit
//
//        = 7 * 2 = 14.
//
//        The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.










