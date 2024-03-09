package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.proxy.EmailCommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //whenever somebody requests CommentService bean, I want different beans to be created in the container
//@Scope(BeanDefinition.SCOPE_PROTOTYPE) // Just another way. It does the same as above.
@Lazy
public class CommentService {

    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    //    public CommentService(@Qualifier("emailCommentNotificationProxy") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
    public CommentService(@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
        System.out.println("Hello");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
