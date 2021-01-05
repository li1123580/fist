public class wanmeishu {
        public static boolean checkPerfectNumber(int num) {
            int sum =1;
            for (int i=2;i<num;i++){
                if(num/i==0){
                    sum+=i;
                }
            }

            return sum==num ? true:false;
        }
    public static void main(String[] args) {
        boolean bb = checkPerfectNumber(6);
        System.out.println(bb);
    }
}
