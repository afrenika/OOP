public class CottonPants implements Pants{
    @Override
    public void wash() {
        System.out.println("разобрать по цвету и загрязненности, закрыть все застежки, стирать в машинке 1,5 - 2 часа при температуре 40-95, можно повторно сполоснуть и сушить в отдалении от солнечных лучей");
    }

    @Override
    public void getStructure() {
        System.out.println("100% хлопок");
    }
}
