package io.gulp.app.view.admin.user;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import io.gulp.app.presenter.admin.user.CreatePresenter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Babur Duisenov.
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CreatePage extends Panel implements CreatePresenter.View {

    Button button = new Button("increment");

    Label label = new Label();

    @PostConstruct
    private void init() {
        setSizeFull();
        VerticalLayout layout = new VerticalLayout();
        layout.addComponent(button);
        layout.addComponent(label);
        setContent(layout);
    }

    @Override
    public Button getButton() {
        return button;
    }

    @Override
    public Label getLabel() {
        return label;
    }
}
