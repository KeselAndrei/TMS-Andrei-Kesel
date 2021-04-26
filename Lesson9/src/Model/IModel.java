package Model;

import CarIsNotStartException.CarIsNotStartException;

public interface IModel {
    void start() throws CarIsNotStartException;
}