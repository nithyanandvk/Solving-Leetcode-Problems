public class Codec {
    HashMap<String, String> h = new HashMap<>();
    HashMap<String, String> hh = new HashMap<>();
    static final String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    // Encodes a URL to a shortened URL.
    public String encode(String l) {
        if (hh.containsKey(l)) {
            return hh.get(l);
        }
        String t = get();
        while (h.containsKey(t)) {
            t = get();
        }
        h.put(t, l);
        hh.put(l, t);
        return t;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String s) {
        return h.get(s);
    }

    private String get() {
        char[] a = new char[6];
        for (int i = 0; i < 6; i++) {
            a[i] = s.charAt((int) (Math.random() * 62));
        }
        return "http://tinyurl.com/" + String.valueOf(a);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));