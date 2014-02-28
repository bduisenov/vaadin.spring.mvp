package io.gulp.app.presenter.core;

import com.vaadin.navigator.View;
import com.vaadin.server.*;
import com.vaadin.shared.communication.SharedState;
import com.vaadin.ui.Component;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.UI;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * @author Babur Duisenov.
 */
public abstract class Presenter <T extends Component> implements View, Component {

    protected T view;

    protected abstract void setView(T component);

    @Override
    public String getStyleName() {
        return view.getStyleName();
    }

    @Override
    public void setStyleName(String style) {
        view.setStyleName(style);
    }

    @Override
    public void addStyleName(String style) {
        view.addStyleName(style);
    }

    @Override
    public void removeStyleName(String style) {
        view.removeStyleName(style);
    }

    @Override
    public String getPrimaryStyleName() {
        return view.getPrimaryStyleName();
    }

    @Override
    public void setPrimaryStyleName(String style) {
        view.setPrimaryStyleName(style);
    }

    @Override
    public boolean isEnabled() {
        return view.isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        view.setEnabled(enabled);
    }

    @Override
    public boolean isVisible() {
        return view.isVisible();
    }

    @Override
    public void setVisible(boolean visible) {
        view.setVisible(visible);
    }

    @Override
    public void setParent(HasComponents parent) {
        view.setParent(parent);
    }

    @Override
    public HasComponents getParent() {
        return view.getParent();
    }

    @Override
    public boolean isReadOnly() {
        return view.isReadOnly();
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        view.setReadOnly(readOnly);
    }

    @Override
    public String getCaption() {
        return view.getCaption();
    }

    @Override
    public void setCaption(String caption) {
        view.setCaption(caption);
    }

    @Override
    public Resource getIcon() {
        return view.getIcon();
    }

    @Override
    public void setIcon(Resource icon) {
        view.setIcon(icon);
    }

    @Override
    public UI getUI() {
        return view.getUI();
    }

    @Override
    public void attach() {
        view.attach();
    }

    @Override
    public Locale getLocale() {
        return view.getLocale();
    }

    @Override
    public void setId(String id) {
        view.setId(id);
    }

    @Override
    public String getId() {
        return view.getId();
    }

    @Override
    public String getDescription() {
        return view.getDescription();
    }

    @Override
    public void addListener(Listener listener) {
        view.addListener(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        view.removeListener(listener);
    }

    @Override
    public void addAttachListener(AttachListener listener) {
        view.addAttachListener(listener);
    }

    @Override
    public void removeAttachListener(AttachListener listener) {
        view.removeAttachListener(listener);
    }

    @Override
    public void addDetachListener(DetachListener listener) {
        view.addDetachListener(listener);
    }

    @Override
    public void removeDetachListener(DetachListener listener) {
        view.removeDetachListener(listener);
    }

    @Override
    public List<ClientMethodInvocation> retrievePendingRpcCalls() {
        return view.retrievePendingRpcCalls();
    }

    @Override
    public boolean isConnectorEnabled() {
        return view.isConnectorEnabled();
    }

    @Override
    public Class<? extends SharedState> getStateType() {
        return view.getStateType();
    }

    @Override
    public void requestRepaint() {
        view.requestRepaint();
    }

    @Override
    public void markAsDirty() {
        view.markAsDirty();
    }

    @Override
    public void requestRepaintAll() {
        view.requestRepaintAll();
    }

    @Override
    public void markAsDirtyRecursive() {
        view.markAsDirtyRecursive();
    }

    @Override
    public boolean isAttached() {
        return view.isAttached();
    }

    @Override
    public void detach() {
        view.detach();
    }

    @Override
    public Collection<Extension> getExtensions() {
        return view.getExtensions();
    }

    @Override
    public void removeExtension(Extension extension) {
        view.removeExtension(extension);
    }

    @Override
    public void beforeClientResponse(boolean initial) {
        view.beforeClientResponse(initial);
    }

    @Override
    public JSONObject encodeState() throws JSONException {
        return view.encodeState();
    }

    @Override
    public boolean handleConnectorRequest(VaadinRequest request, VaadinResponse response, String path) throws IOException {
        return view.handleConnectorRequest(request, response, path);
    }

    @Override
    public ServerRpcManager<?> getRpcManager(String rpcInterfaceName) {
        return view.getRpcManager(rpcInterfaceName);
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return view.getErrorHandler();
    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {
        view.setErrorHandler(errorHandler);
    }

    @Override
    public String getConnectorId() {
        return view.getConnectorId();
    }

    @Override
    public float getWidth() {
        return view.getWidth();
    }

    @Override
    public float getHeight() {
        return view.getHeight();
    }

    @Override
    public Unit getWidthUnits() {
        return view.getWidthUnits();
    }

    @Override
    public Unit getHeightUnits() {
        return view.getHeightUnits();
    }

    @Override
    public void setHeight(String height) {
        view.setHeight(height);
    }

    @Override
    public void setWidth(float width, Unit unit) {
        view.setWidth(width, unit);
    }

    @Override
    public void setHeight(float height, Unit unit) {
        view.setHeight(height, unit);
    }

    @Override
    public void setWidth(String width) {
        view.setWidth(width);
    }

    @Override
    public void setSizeFull() {
        view.setSizeFull();
    }

    @Override
    public void setSizeUndefined() {
        view.setSizeUndefined();
    }

}
