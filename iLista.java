/**
 * 
 * @author MAQUITO
 *
 * @param <E>
 */
public interface iLista<E> {


    public E removeFirst(); // remover primerp de la lista
    public boolean isEmpty(); // boolenano para revisar si esta vacia la lista
    public void addFirst(E e); // agreagar alprincipio de la lista
    public int size(); // verificar el tamaño de la lista

}
