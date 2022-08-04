package com.company;

public enum Days {
    DUYCHOMBU{
        @Override
        public void method() {

        }
    },
    SHEYSHEMBI{
        @Override
        public void method() {

        }
    },
    SHARSHEMBI{
        @Override
        public void method() {

        }
    },
    BEYSHEMBI{
        @Override
        public void method() {

        }
    },
    JUMA{
        @Override
        public void method() {

        }
    },
    ISHEMBI{
        @Override
        public void method() {

        }
    },
    JEKSHEMBI{
        @Override
        public void method() {

        }
    },
    ;

    public abstract void method();

    @Override
    public String toString() {
        return "Days{}";
    }
}
