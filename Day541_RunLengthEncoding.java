class Day541_RunLengthEncoding {
    public String compress (String s, int n) {
        char [] a = s.toCharArray();
        char seen=a[0];
        int count = 1; 
        String res = ""; 
        
        for (int i= 1; i<a.length; i++) {
            if (a[i] == seen) {
                count++;
            } else {
                res += count  + "" + seen;
                seen = a[i];
                count = 1;
            }
        }
        
        res += count  + "" + seen;
        
        return res;
    }

    public String decompress(String s) {
        String res = "";
        String numberAsString = "";

        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numberAsString += s.charAt(i);
            } else {
                int number = Integer.parseInt(numberAsString);
                while (number-- >=0)
                    res += s.charAt(i);
                
                numberAsString = "";
            }
        }

        return res;
    }
}