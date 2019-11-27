package com.aldamr01.nymphaeaapp.home.dashboard;

import java.util.List;

public class DashboardModel {
    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private Integer status_code;
    private String message;
    private List<Data> data;

    public class Data{
        public String model;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Integer getPk() {
            return pk;
        }

        public void setPk(Integer pk) {
            this.pk = pk;
        }

        public List<Fields> getField() {
            return field;
        }

        public void setField(List<Fields> field) {
            this.field = field;
        }

        public Integer pk;
        public List<Fields> field;

        public class Fields{
            public Integer csite;
            public String name;

            public Integer getCsite() {
                return csite;
            }

            public void setCsite(Integer csite) {
                this.csite = csite;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getSeeds_type() {
                return seeds_type;
            }

            public void setSeeds_type(String seeds_type) {
                this.seeds_type = seeds_type;
            }

            public String getSeeds_released_date() {
                return seeds_released_date;
            }

            public void setSeeds_released_date(String seeds_released_date) {
                this.seeds_released_date = seeds_released_date;
            }

            public Integer getSeeds_released() {
                return seeds_released;
            }

            public void setSeeds_released(Integer seeds_released) {
                this.seeds_released = seeds_released;
            }

            public String getSpecifications() {
                return specifications;
            }

            public void setSpecifications(String specifications) {
                this.specifications = specifications;
            }

            public String getIs_active() {
                return is_active;
            }

            public void setIs_active(String is_active) {
                this.is_active = is_active;
            }

            public Float getIdeal_ph_min() {
                return ideal_ph_min;
            }

            public void setIdeal_ph_min(Float ideal_ph_min) {
                this.ideal_ph_min = ideal_ph_min;
            }

            public Float getIdeal_ph_max() {
                return ideal_ph_max;
            }

            public void setIdeal_ph_max(Float ideal_ph_max) {
                this.ideal_ph_max = ideal_ph_max;
            }

            public Float getIdeal_temperature_min() {
                return ideal_temperature_min;
            }

            public void setIdeal_temperature_min(Float ideal_temperature_min) {
                this.ideal_temperature_min = ideal_temperature_min;
            }

            public Float getIdeal_temperature_max() {
                return ideal_temperature_max;
            }

            public void setIdeal_temperature_max(Float ideal_temperature_max) {
                this.ideal_temperature_max = ideal_temperature_max;
            }

            public Float getIdeal_tds_min() {
                return ideal_tds_min;
            }

            public void setIdeal_tds_min(Float ideal_tds_min) {
                this.ideal_tds_min = ideal_tds_min;
            }

            public Float getIdeal_tds_max() {
                return ideal_tds_max;
            }

            public void setIdeal_tds_max(Float ideal_tds_max) {
                this.ideal_tds_max = ideal_tds_max;
            }

            public Float getIdeal_turbidity_min() {
                return ideal_turbidity_min;
            }

            public void setIdeal_turbidity_min(Float ideal_turbidity_min) {
                this.ideal_turbidity_min = ideal_turbidity_min;
            }

            public Float getIdeal_turbidity_max() {
                return ideal_turbidity_max;
            }

            public void setIdeal_turbidity_max(Float ideal_turbidity_max) {
                this.ideal_turbidity_max = ideal_turbidity_max;
            }

            public Float getIdeal_oxygen_min() {
                return ideal_oxygen_min;
            }

            public void setIdeal_oxygen_min(Float ideal_oxygen_min) {
                this.ideal_oxygen_min = ideal_oxygen_min;
            }

            public Float getIdeal_oxygen_max() {
                return ideal_oxygen_max;
            }

            public void setIdeal_oxygen_max(Float ideal_oxygen_max) {
                this.ideal_oxygen_max = ideal_oxygen_max;
            }

            public String getIdeal_value_status() {
                return ideal_value_status;
            }

            public void setIdeal_value_status(String ideal_value_status) {
                this.ideal_value_status = ideal_value_status;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String description;
            public String seeds_type;
            public String seeds_released_date;
            public Integer seeds_released;
            public String specifications;
            public String is_active;
            public Float ideal_ph_min;
            public Float ideal_ph_max;
            public Float ideal_temperature_min;
            public Float ideal_temperature_max;
            public Float ideal_tds_min;
            public Float ideal_tds_max;
            public Float ideal_turbidity_min;
            public Float ideal_turbidity_max;
            public Float ideal_oxygen_min;
            public Float ideal_oxygen_max;
            public String ideal_value_status;
            public Float current_ph;
            public Float current_tds;

            public float getCurrent_ph() {
                return current_ph;
            }

            public void setCurrent_ph(Float current_ph) {
                this.current_ph = current_ph;
            }

            public float getCurrent_tds() {
                return current_tds;
            }

            public void setCurrent_tds(Float current_tds) {
                this.current_tds = current_tds;
            }

            public float getCurrent_turbidity() {
                return current_turbidity;
            }

            public void setCurrent_turbidity(Float current_turbidity) {
                this.current_turbidity = current_turbidity;
            }

            public float getCurrent_oxygen() {
                return current_oxygen;
            }

            public void setCurrent_oxygen(Float current_oxygen) {
                this.current_oxygen = current_oxygen;
            }

            public float getCurrent_temperature() {
                return current_temperature;
            }

            public void setCurrent_temperature(Float current_temperature) {
                this.current_temperature = current_temperature;
            }

            public Float current_turbidity;
            public Float current_oxygen;
            public Float current_temperature;
            public String updated_at;
            public String created_at;
        }
    }
}
