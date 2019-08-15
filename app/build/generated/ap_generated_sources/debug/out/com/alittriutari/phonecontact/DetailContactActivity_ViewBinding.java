// Generated code from Butter Knife. Do not modify!
package com.alittriutari.phonecontact;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailContactActivity_ViewBinding implements Unbinder {
  private DetailContactActivity target;

  @UiThread
  public DetailContactActivity_ViewBinding(DetailContactActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailContactActivity_ViewBinding(DetailContactActivity target, View source) {
    this.target = target;

    target.imgContact = Utils.findRequiredViewAsType(source, R.id.ivProfile, "field 'imgContact'", ImageView.class);
    target.txtName = Utils.findRequiredViewAsType(source, R.id.txtName, "field 'txtName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailContactActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgContact = null;
    target.txtName = null;
  }
}
