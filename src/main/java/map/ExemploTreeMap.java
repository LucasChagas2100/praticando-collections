package map;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();
        //monta a arvore com as capitais
        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","Sao Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");
        System.out.println("Valores iniciais: "+treeCapitais);

        System.out.println("\nRetornar a primeira chave no topo da arvore: "+treeCapitais.firstKey());
        System.out.println("Retornar a última chave no final da arvore: "+treeCapitais.lastKey());

        System.out.println("\nRetornar a chave abaixo da capital parametrizada: "+treeCapitais.lowerKey("SC"));
        System.out.println("Retornar a chave acima da capital parametrizada: "+treeCapitais.higherKey("SC"));

        System.out.println("\nRetornar a primeira capital no topo da árvore com valor:");
        System.out.println(treeCapitais.firstEntry().getKey()+" - "+treeCapitais.firstEntry().getValue());
        System.out.println("Retornar a última capital no final da árvore com valor:");
        System.out.println(treeCapitais.lastEntry().getKey()+" - "+treeCapitais.lastEntry().getValue());

        System.out.println("\nRetornar a capital na arvore abaixo da capital parametrizada com chave e valor: SC");
        System.out.println(treeCapitais.lowerEntry("SC").getKey()+ " - "+ treeCapitais.lowerEntry("SC").getValue());
        System.out.println("Retornar a capital na arvore acima da capital parametrizada com chave e valor: SC");
        System.out.println(treeCapitais.higherEntry("SC").getKey()+ " - "+ treeCapitais.higherEntry("SC").getValue());

        //Retornar a primeira e ultima Map.Entry para as variáveis e os remove da lista
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry  = treeCapitais.pollLastEntry();
        System.out.println("\nO primeiro valor da arvore retirado: ");
        System.out.println(firstEntry.getKey()+" - "+ firstEntry.getValue());
        System.out.println("\nO ultimo valor da arvore retirado: ");
        System.out.println(lastEntry.getKey()+" - "+ lastEntry.getValue());

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        System.out.println("\nNavegação através de iterator das chaves:");
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+" -> "+ treeCapitais.get(key));
        }

        System.out.println("\nNavegação através de for each:");
        for (String capital: treeCapitais.keySet() ) {
            System.out.println(capital+" --> "+treeCapitais.get(capital));
        }

        System.out.println("\nNavegação através de Map.Entry:");
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey()+" ---> "+capital.getValue());
        }
    }
}
