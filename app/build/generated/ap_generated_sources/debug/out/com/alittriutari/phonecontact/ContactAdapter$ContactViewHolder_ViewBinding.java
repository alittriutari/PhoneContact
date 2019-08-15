// Generated code from Butter Knife. Do not modify!
package com.alittriutari.phonecontact;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ContactAdapter$ContactViewHolder_ViewBinding implements Unbinder {
  private ContactAdapter.ContactViewHolder target;

  @UiThread
  public ContactAdapter$ContactViewHolder_ViewBinding(ContactAdapter.ContactViewHolder target,
      View source) {
    this.target = target;

    target.imgContact = Utils.findRequiredViewAsType(source, R.id.imgContact, "field 'imgContact'", CircleImageView.class);
    target.txtName = Utils.findRequiredViewAsType(source, R.id.txtName, "field 'txtName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ContactAdapter.ContactViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgContact = null;
    target.txtName = null;
  }
}
