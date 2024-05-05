CREATE TABLE IF NOT EXISTS tbl_post(
     id                 INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    title               VARCHAR(100) NOT NULL,
    author              VARCHAR(40) NOT NULL,
    date_created        DATE NOT NULL,
    date_updated        DATE NOT NULL,
    body                TEXT NOT NULL,
    image_path          VARCHAR(150)
);