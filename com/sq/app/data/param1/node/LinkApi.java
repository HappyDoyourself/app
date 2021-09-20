package com.sq.app.data.param1.node;

/**
 * @Author fanht
 * @Description  java实现链表的crud
 * @Date 2021/3/17 2:18 PM
 * @Version 1.0
 */
public class LinkApi<E> {

    private int size;

    private Node<E> first;

    /**
     * 查询
     * @param index
     * @return
     */
    public Node<E> find(int index){
        Node x = first;

        for(int k = 0;k<index;k++){
            x= x.next;
        }
        return x;
    }

    /**
     * 添加
     * @param index
     * @param element
     */
    public void add(int index,E element){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("索引越界");
        }
        if(index == 0){
            first = new Node<E>(null,element);
        }else {
            Node<E> pre = find(index-1);
            Node<E> next = pre.next;
            pre.next = new Node<>(next,element);
        }
        size++;
    }

    /**
     * 添加尾元素
     * @param element
     */
    public void addLast(E element){
        add(size,element);
    }


    /**
     * 获取element
     * @param index
     * @return
     */
    public E get(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("索引越界");
        }
        return find(index).element;
    }

    /**
     * 更新方法
     * @param index
     * @param element
     * @return
     */
    public E update(int index,E element){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("索引越界");
        }
        Node<E> node = find(index);
        E oldElement = node.element;
        node.element = element;

        return oldElement;
    }


    public E  delete(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("索引越界");
        }

        if(index == 0){
            first = first.next;
            size--;
            return find(0).element;
        }else {
            Node<E> pre = find(index-1);
            Node<E> old = pre.next;
            Node<E> next = pre.next;
            size--;
            return old.element;
        }
    }


    public String linkToStr(){
        StringBuffer stringBuffer = new StringBuffer();
        if(size == 0){
            return  "[]";
        }else {
            stringBuffer.append("[");
            Node x = first;
            for(Node i = x;i!=null;i=i.next){
                if(i.next == null){
                    stringBuffer.append(i.element).append("]");
                }else {
                    stringBuffer.append(i.element).append(" ");
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        LinkApi<Integer> linkApi = new LinkApi<>();
        linkApi.addLast(3);
        linkApi.addLast(4);
        linkApi.addLast(5);
        linkApi.addLast(6);
        linkApi.addLast(7);

        System.out.println(linkApi.linkToStr());

        linkApi.add(3,888);
        System.out.println(linkApi.linkToStr());
        System.out.println(linkApi.get(3));
        linkApi.update(0,4444);
        System.out.println(linkApi.linkToStr());
        linkApi.delete(0);
        System.out.println(linkApi.linkToStr());
    }
}
