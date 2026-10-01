public class secondLargest {
//    public static void main (String[] args){
//        int []a = {1,2,3,4,5,6};
//        int slar = Integer.MIN_VALUE;
//        int lar = Integer.MIN_VALUE;
//        int n = a.length;
//        for ( int i = 0 ; i < n;i++){
//            if(a[i]>lar){
//                slar = lar;
//                lar = a[i];
//
//            }
//            else if (a[i] > slar && a[i] != lar){
//                slar = a[i];
//
//            }
//
//        }
//        System.out.print(slar);
//    }
        public static void main (String[] args){
        int []a = {1,2,3,4,5,6};
        int ssml = Integer.MAX_VALUE;
        int sml = a[0];
        int n = a.length;
        for ( int i = 0 ; i < n;i++){
            if(a[i] < sml){
                ssml = sml;
                sml = a[i];

            }
            else if (a[i] < ssml && a[i] != sml){
                ssml = a[i];

            }

        }
        System.out.print(ssml);
    }
}
