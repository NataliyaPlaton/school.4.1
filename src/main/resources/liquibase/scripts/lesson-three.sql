-- liquibase formatted sql

-- changeset liquibase:1
CREATE INDEX student_name_index ON student (name);

-- changeset liquibase:2
CREATE INDEX faculty_nc_idx ON faculty (name, color);