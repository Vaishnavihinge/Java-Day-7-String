public class StringImmutable {

    public static void main(String[] args) {

        //  String Pool reuse
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("String Pool Check:");
        System.out.println(s1 == s2);  //S1 and s2 refer same object 

        //  No modification without assignment
    
        s1.concat(" Programming");
        System.out.println("s1 after concat(): " + s1);  

        //New object created after modificatio
        String s3 = s1.concat(" Programming");
        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println("s1 == s3 : " + (s1 == s3));

        // Safe sharing concept
        System.out.println(" Safe Sharing Concept:");
        String shared = "Hello";
        String modified = shared.concat(" World");
        System.out.println("shared: " + shared);
        System.out.println("modified: " + modified);
    }
}

