package factorymethod;

public class Main {
    public static void main(String[] args) {
        int unitsConsumed = 10;
        Plan plan = PlanFactory.getPlan(PlanFactory.PlanType.PLAN_TYPE_COMMERCIAL);
        System.out.println(plan.getAmount(unitsConsumed));

        plan = PlanFactory.getPlan(PlanFactory.PlanType.PLAN_TYPE_DOMESTIC);
        System.out.println(plan.getAmount(unitsConsumed));

        plan = PlanFactory.getPlan(PlanFactory.PlanType.PLAN_TYPE_INDUSTRIAL);
        System.out.println(plan.getAmount(unitsConsumed));
    }
}
