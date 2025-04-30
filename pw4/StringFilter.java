package pw4;
public interface StringFilter {
    String filter(String s);
}
class UpperCaseStringFilter implements StringFilter {
    public String filter(String s) {
        return s.toUpperCase();
    }
}
class LowerCaseStringFilter implements StringFilter {
    public String filter(String s) {
        return s.toLowerCase();
    }
}
class PrefixStringFilter implements StringFilter {
    private int n;

    public PrefixStringFilter(int n) {
        this.n = n;
    }

    public String filter(String s) {
        return s.length() <= n ? s : s.substring(0, n);
    }
}
class SuffixStringFilter implements StringFilter {
    private int n;

    public SuffixStringFilter(int n) {
        this.n = n;
    }

    public String filter(String s) {
        return s.length() <= n ? s : s.substring(s.length() - n);
    }
}
class StringFilterUtils {
    public static String[] filter(String[] strings, StringFilter filter) {
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            result[i] = filter.filter(strings[i]);
        }
        return result;
    }
}
class CompositeStringFilter implements StringFilter {
    private StringFilter[] filters;

    public CompositeStringFilter(StringFilter[] filters) {
        this.filters = filters;
    }

    public String filter(String s) {
        for (StringFilter filter : filters) {
            s = filter.filter(s);
        }
        return s;
    }
    public static void main(String[] args) {
        String[] inputs = {"HelloWorld", "JavaProgramming"};

        StringFilter upper = new UpperCaseStringFilter();
        StringFilter lower = new LowerCaseStringFilter();
        StringFilter prefix = new PrefixStringFilter(5);
        StringFilter suffix = new SuffixStringFilter(5);
        StringFilter[] filters = {upper, suffix};

        CompositeStringFilter composite = new CompositeStringFilter(filters);

        String[] result = StringFilterUtils.filter(inputs, composite);
        for (String s : result) {
            System.out.println(s);}}}