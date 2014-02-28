package io.gulp.app.presenter.home;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import io.gulp.app.presenter.admin.user.CreatePresenter;
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
@VaadinView("")
public class HomePresenter extends Presenter<HomePresenter.View> {

    public interface View extends com.vaadin.ui.Component {
        Link getLink();

        Label getLabel();
    }

    @Override
    @Autowired
    protected void setView(View view) {
        this.view = view;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }

    @PostConstruct
    private void init() {
        Link link = view.getLink();
        link.setCaption("go");
        link.setResource(new ExternalResource("#!" + CreatePresenter.PATH));
    }

}
