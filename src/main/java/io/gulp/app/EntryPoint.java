package io.gulp.app;

import com.google.common.base.Function;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.xpoft.vaadin.DiscoveryNavigator;

import javax.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Theme("theme")
public class EntryPoint extends UI {

    private static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);

    @Autowired
    private EventBus eventBus;

    private final Panel header = new Panel();
    private final Panel menuContainer = new Panel();
    private final Panel contentContainer = new Panel();
    private final Panel footer = new Panel();

    @Override
    protected void init(VaadinRequest request) {
        CustomLayout cl = new CustomLayout("squelette");
        cl.addComponent(header, "headerContainer");
        cl.addComponent(menuContainer, "menuContainer");
        cl.addComponent(contentContainer, "contentContainer");
        cl.addComponent(footer, "footerContainer");
        setContent(cl);
        new DiscoveryNavigator(this, contentContainer).navigateTo("");
        logger.info("entryPoint vaadin initialization");
    }

    @PostConstruct
    private void postInit() {
        eventBus.register(new Function<Object, Void>() {
            @Subscribe public Void apply(Object event) {
                //todo
                return null;
            }
        });
        logger.info("application started");
    }

}
