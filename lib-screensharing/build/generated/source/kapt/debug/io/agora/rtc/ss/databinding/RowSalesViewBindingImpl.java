package io.agora.rtc.ss.databinding;
import io.agora.rtc.ss.R;
import io.agora.rtc.ss.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowSalesViewBindingImpl extends RowSalesViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profile_image, 3);
        sViewsWithIds.put(R.id.ivStatus, 4);
        sViewsWithIds.put(R.id.ivOptions, 5);
        sViewsWithIds.put(R.id.tvStatus, 6);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowSalesViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowSalesViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.cvView.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.dataModel == variableId) {
            setDataModel((io.agora.rtc.screenshare.model.CommonData.Customer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDataModel(@Nullable io.agora.rtc.screenshare.model.CommonData.Customer DataModel) {
        this.mDataModel = DataModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dataModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataModelFirstName = null;
        io.agora.rtc.screenshare.model.CommonData.Customer dataModel = mDataModel;
        java.lang.String dataModelLastName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dataModel != null) {
                    // read dataModel.first_name
                    dataModelFirstName = dataModel.getFirst_name();
                    // read dataModel.last_name
                    dataModelLastName = dataModel.getLast_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataModelFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataModelLastName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dataModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}