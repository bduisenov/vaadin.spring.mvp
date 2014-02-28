package io.gulp.app.presenter.admin.user;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import io.gulp.app.presenter.core.Presenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.xpoft.vaadin.VaadinView;

import javax.annotation.PostConstruct;

/**
 * @author Babur Duisenov.
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@VaadinView(CreatePresenter.PATH)
public class CreatePresenter extends Presenter<CreatePresenter.View> {

    public final static String PATH = "/admin/user/create";

    public interface View extends com.vaadin.ui.Component {
        Button getButton();
        Label getLabel();
    }

    private int count;

    @Override
    @Autowired
    protected void setView(View view) {
        this.view = view;
    }

    @PostConstruct
    private void init() {
        view.getButton().addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                view.getLabel().setValue("Yeappy MVP " + count++);
            }
        });
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }

}
