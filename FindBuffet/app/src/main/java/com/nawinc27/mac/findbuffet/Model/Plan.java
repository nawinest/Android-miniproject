package com.nawinc27.mac.findbuffet.Model;

public class Plan {

    private String _name;
    private String _date_plan;
    private String _note_plan;
    private int id;

    public Plan(){

    }

    public Plan(int id,String _name, String _date_plan, String _note_plan) {
        this.id = id;
        this._name = _name;
        this._date_plan = _date_plan;
        this._note_plan = _note_plan;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_date_plan() {
        return _date_plan;
    }

    public void set_date_plan(String _date_plan) {
        this._date_plan = _date_plan;
    }

    public String get_note_plan() {
        return _note_plan;
    }

    public void set_note_plan(String _time_plan) {
        this._note_plan = _time_plan;
    }
}
