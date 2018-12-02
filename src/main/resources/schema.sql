-- DROP TABLE IF EXISTS ticket_request;
CREATE TABLE IF NOT EXISTS ticket_request(
  `id` SERIAL NOT NULL AUTO_INCREMENT,
  `from` BIGINT,
  `to` BIGINT,
  `url` VARCHAR,
  `date` DATE
  );