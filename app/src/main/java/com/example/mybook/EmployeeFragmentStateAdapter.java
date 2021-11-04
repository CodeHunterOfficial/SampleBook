package com.example.mybook;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFragmentStateAdapter extends FragmentStateAdapter {

    private List<Employee> employees;


    public EmployeeFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

        this.employees = this.intDatas();
    }

    private List<Employee> intDatas()  {
        Employee emp1 = new Employee("Alizosa Vali", "alizoda2020@example.com", "Web Designer");
        Employee emp2 = new Employee("Safarzoda Rustam", "safarzoda2121@example.com", "Project Manager");
        Employee emp3 = new Employee("Askarzoda Aslam", "askarzoda@example.com", "President of Sales");
        Employee emp4 = new Employee("Muinzoda Mosafar", "muinzoda@example.com", "Mobile Designer");

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        return list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Employee employee = this.employees.get(position);
        return new EmployeePageFragment(employee);
    }


    @Override
    public int getItemCount() {
        return this.employees.size();
    }
}