public class LinenShirt implements Shirt{
    @Override
    public void wash() {
        System.out.println("если у вас нет кружевной, атласной или бархатной подкладки, вы можете безопасно использовать стиральную машину.\n" +
                "Обработайте пятна пищевой содой и белым уксусом, перед началом стирки застегните пуговицы и завяжите завязки, выберите щадящее средство и щадящий режим, сушите на воздухе");
    }

    @Override
    public void getStructure() {
        System.out.println("100% лен");
    }
}
