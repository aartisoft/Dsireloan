package com.smartloan.smtrick.smart_loan_user.view.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.smartloan.smtrick.smart_loan_user.R;
import com.smartloan.smtrick.smart_loan_user.databinding.InvoiceAdapterLayoutBinding;
import com.smartloan.smtrick.smart_loan_user.models.LeedsModel;
import com.smartloan.smtrick.smart_loan_user.view.holders.InvoiceViewHolder;

import java.util.ArrayList;

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceViewHolder> {

    private ArrayList<LeedsModel> invoiceArrayList;
    private Context context;

    public InvoiceAdapter(Context context, ArrayList<LeedsModel> data) {
        this.invoiceArrayList = data;
        this.context = context;
    }

    @Override
    public InvoiceViewHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        InvoiceAdapterLayoutBinding invoiceAdapterLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.invoice_adapter_layout, parent, false);
        return new InvoiceViewHolder(invoiceAdapterLayoutBinding);
    }

    private LeedsModel getModel(int position) {
        return (invoiceArrayList.get(invoiceArrayList.size() - 1 - position));
    }

    @Override
    public void onBindViewHolder(final InvoiceViewHolder holder, final int listPosition) {
        try {
            LeedsModel invoice = getModel(listPosition);
            holder.invoiceAdapterLayoutBinding.txtidvalue.setText(invoice.getLeedNumber());
            holder.invoiceAdapterLayoutBinding.txtcnamevalue.setText(invoice.getCustomerName());
            holder.invoiceAdapterLayoutBinding.txtbankvalue.setText(invoice.getExpectedLoanAmount());
         //   holder.invoiceAdapterLayoutBinding.txtStatusValue.setText(invoice.getApprovedDate());
            holder.invoiceAdapterLayoutBinding.txtcommisionvalue.setText(invoice.getStatus());

            String loanType = invoice.getLoanType().toString();

            if (loanType.equalsIgnoreCase("Home Loan")){

            Glide.with(context).load(R.drawable.home_loan_gray)
                    .apply(new RequestOptions().placeholder(R.drawable.loading))
                    .into( holder.invoiceAdapterLayoutBinding.loanlogo);
            }else if (loanType.equalsIgnoreCase("Personal Loan")){

                Glide.with(context).load(R.drawable.personal_loan_gray)
                        .apply(new RequestOptions().placeholder(R.drawable.loading))
                        .into( holder.invoiceAdapterLayoutBinding.loanlogo);
            }else if (loanType.equalsIgnoreCase("Morgage Loan")){

                Glide.with(context).load(R.drawable.mortgage_loan_gray)
                        .apply(new RequestOptions().placeholder(R.drawable.loading))
                        .into( holder.invoiceAdapterLayoutBinding.loanlogo);
            }else if (loanType.equalsIgnoreCase("Top Up")){

                Glide.with(context).load(R.drawable.topup_loan_gray)
                        .apply(new RequestOptions().placeholder(R.drawable.loading))
                        .into( holder.invoiceAdapterLayoutBinding.loanlogo);
            }else if (loanType.equalsIgnoreCase("Doctor Loan")){

                Glide.with(context).load(R.drawable.doctor_loan_gray)
                        .apply(new RequestOptions().placeholder(R.drawable.loading))
                        .into( holder.invoiceAdapterLayoutBinding.loanlogo);
            }else if (loanType.equalsIgnoreCase("Balance Transfer Loan")){

                Glide.with(context).load(R.drawable.balance_transfer_loan_gray)
                        .apply(new RequestOptions().placeholder(R.drawable.loading))
                        .into( holder.invoiceAdapterLayoutBinding.loanlogo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return invoiceArrayList.size();
    }

    public void reload(ArrayList<LeedsModel> arrayList) {
        invoiceArrayList.clear();
        invoiceArrayList.addAll(arrayList);
        notifyDataSetChanged();
    }
}