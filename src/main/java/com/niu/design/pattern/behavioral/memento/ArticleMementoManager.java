package com.niu.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 备忘录模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 15:11]
 * @createTime [2021/01/07 15:11]
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addMemento(ArticleMemento memento) {
        ARTICLE_MEMENTO_STACK.add(memento);
    }
}
