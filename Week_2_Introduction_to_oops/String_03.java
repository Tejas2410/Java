public class String_03 {
    public static void main(String[] args) {
        String str = new String("navin");

        String name = "navin"; // behind the scene this will create an object in heap

        System.out.println("Hello " + str); // Hello Navin
        name = name + "Reddy"; // new string is created in heap and will refer to diff memory location
        // previous string will be eligible for garbage collection
        System.out.println(str.charAt(1)); // a

        System.out.println(name.concat(" " + str)); // Tejas Navin
        System.out.println(str.hashCode()); // 75041128

        // mutable (change) vs immutable (not change) (refer image 1)
                                                    //~~~~~~~~~~~~~~~~

        // s1 and s2 will point to the same memory location in heap memory (string constant pool) cos string is immutable
        String s1 = "Navin";
        String s2 = "Navin";
        System.out.println(s1 == s2); // true

        // StringBuffer(thread safe) and StringBuilder(not thread safe) (mutable string)
        
        StringBuffer sb = new StringBuffer("Tejas");

        // to make string mutable capacity is 21 to have continuos memory location in heap memory 
        // there is no need for string relocation when append that's why it has buffer of 21 capacity
        System.out.println(sb.capacity()); // 21 
        System.out.println(sb.length()); // 5

        sb.append(" Patil");
        System.out.println(sb); // Tejas Patil

        sb.deleteCharAt(2);
        System.out.println(sb); // Teas Patil

        sb.ensureCapacity(30);// capacity will be 30

        sb.insert(4, " Java");
        System.out.println(sb); // Teas Java Patil

        sb.setLength(30); // length will be 30 (empty value will be null after Patil)

        String str1 = sb.toString(); // stringbuffer to string


    }
}
