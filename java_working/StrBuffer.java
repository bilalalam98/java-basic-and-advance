public class StrBuffer {
    public static void main(String[] args) {

        // now there is one more type which is StringBuilder the only difference is the StringBuffer is thread safe and string buffer is not
        StringBuffer sb = new StringBuffer();
        StringBuffer st = new StringBuffer("bilal");
        System.out.println(st.capacity()+" "+sb.capacity());
        //string buffert provider 16 bytes at the time of creation if you provide a string in it it add more byte to it 
        //the reason it provides the extra bytes is it stores the name and when you change the data it safes it in the continous space memory and if its not present
        //it relocate the dasta to safe from it it gives extra byte\
        st.append("alam");
        // below are some more function
        // st.charAt(7);
        // st.insert(5,"alam");
        // st.substring(0, 2);
        st.setLength(30);
        // st.reverse();
        // st.replace(5, 6, "A");
        // st.ensureCapacity(50);
        System.out.println(st);
    }
}
