package io.gulp.app.view.home;

import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import io.gulp.app.presenter.home.HomePresenter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Babur Duisenov.
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class HomePage extends Panel implements HomePresenter.View {

    private Label label = new Label("click the button to go to /admin/user/create page");

    private Link link = new Link();

    @PostConstruct
    private void init() {
        setSizeFull();
        VerticalLayout layout = new VerticalLayout();

        layout.addComponent(label);
        layout.addComponent(link);
        setContent(layout);
    }

    @Override
    public Link getLink() {
        return link;
    }

    @Override
    public Label getLabel() {
        return label;
    }
}
