public class PaintJob {
    public static void main(String[] args) {

       int num =  (GetBucketCount(3.4,2.1,1.5,2));
        System.out.println("The Total Bucket Needed For Area is: " + num + ".") ;

        int NUM = getBucketCount(3.4,2.1,1.5);
        System.out.println("The Total Bucket Needed For Area is: " + NUM + ".");

        int Number = (int) GetBucketCount(3.26,0.75);
        System.out.println("The Total Bucket Needed For Area is: " + Number + ".");

    }
    public static int GetBucketCount (double Width, double Height, double AreaPerBucket, int ExtraBucket) {

        int  BucketNeeded = 0;


        if ((Width  <= 0 || Height <= 0 || AreaPerBucket <= 0  ) || ExtraBucket < 0 ) {
            return -1;
        }
        else {

            double Area = Height * Width;
            int TOTAL = (int) Math.ceil(Area/ AreaPerBucket);
            TOTAL -=  ExtraBucket;
            BucketNeeded = TOTAL;
        }

        return BucketNeeded;
    }

    // another overloaded Method
    public static int getBucketCount (double width, double height, double AreaPerBucket) {

        int BucketNeeded = 0;

        if (width  <= 0 || height <= 0 || AreaPerBucket <= 0  ) {
            return -1;
        }
        else{
            double Area = width * height;
            int TOTAL = (int) Math.ceil(Area/AreaPerBucket);
            BucketNeeded = TOTAL;
            }

return  BucketNeeded;
        }

    // another overloaded method
    public static int GetBucketCount (double Area, double AreaPerBucket) {
       int BucketNeeded = 0;

        if(Area <= 0 || AreaPerBucket <= 0) {
            return -1;
        }
        else{
            int Total = (int) Math.ceil(Area/AreaPerBucket);
            BucketNeeded = Total;

        }
        return BucketNeeded;
    }

    }

