package sixth_week.source_code.module_12.practices.Overriding;

class Over extends Base {
    public static void main(String[] args) {
        Over o = new Over();
        int iBase = 0;
        o.amethod(iBase);
    }

    public void amethod(int iOver) {
        System.out.println("Over.amethod");
    }
}
